var mysql = require('mysql');
var con = mysql.createConnection({
  host: "192.168.0.145",
  user: "root",
  password: "Kimnamwook!1"
});
con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
});
