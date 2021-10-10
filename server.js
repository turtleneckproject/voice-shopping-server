const express = require("express");
const app = express();
const request = require("request");
const cheerio = require("cheerio");
const cors = require('cors');
const axios = require('axios');
const iconv = require('iconv-lite');
const client_id = "_57EpFGU3bAMM42rMja_";
const client_secret = "I2hqrjpZoY";

var option = {
  query: "",
  display: 27,
  start: 1,
  sort: "sim"
}

const http = require('http').createServer(app);
http.listen(process.env.PORT||8080, function () {
  console.log('listening on 8080')
});

app.use(cors({
  origin: '*'
}))

app.get("/api/item", function(req,res){
    var data;
    option.query = req.query.keyword;
    console.log(option.query);

    request.get({
      uri: "https://openapi.naver.com/v1/search/shop.json",
      qs: option,
      headers: {
        'X-Naver-Client-Id': client_id,
        'X-Naver-Client-Secret':client_secret
      }
    }, function(error, response, body){
      if (!error && response.statusCode == 200) {
        const first = JSON.parse(body);
        console.log(first);
        // console.log(first.items);
        res.send(first.items);
      } else {
        console.log("error = " + response.statusCode);
      }
    });
});

exports = module.exports = app;