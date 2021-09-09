var express = require('express')
var app = express()
console.log("start node server")
app.listen(3000, function() {
    console.log("start! express server on port 3000")
})
app.get('/', function(req,res) {
    res.send("<h1>hi friend!</h1>")
})
app.get('/', function(req,res) {
    res.sendFile(__dirname + "/public/main.html")
})
app.get('/main', function(req,res) {
    res.sendFile(__dirname + "/public/main.html")
})
app.use(express.static('public'))
let toplist = [
    {
        id: 'top1',
        name: '1.불꽃놀이'
    },
    {
        id: 'top2',
        name: '2.대우주'
    },
    {
        id: 'top3',
        name: '3.미꾸라지'
    },
]
app.use(express.static('public'))
    let trot =[
    {
        id: '트로트',
        name: '---'
    },
    {
        id: '트로트',
      name: '---'
    },
    {
        id: '트로트',
        name: '---'
    }
]
app.use(express.static('public'))
    let pop =[
    {
        id: '팝',
        name: '---'
    },
    {
        id: '팝',
        name: '---'
    },
    {
        id: '팝',
        name: '---'
    },
]
app.use(express.static('public'))
    let lab =[
    {
        id: '랩',
        name: '---'
    },
    {
        id: '랩',
        name: '---'
    },
    {
        id: '랩',
        name: '---'
    },
]
app.get('/toplist',(req,res)=>{
    return res.json(toplist);
});
app.get('/trot',(req,res)=>{
    return res.json(trot);
});
app.get('/lab',(req,res)=>{
    return res.json(lab);
});
app.get('/pop',(req,res)=>{
    return res.json(pop);
});
app.get('/public', function(req, res){
	var topic = [
		'javascript is...',
		'nodejs is...',
		'express is...'
	];
	var li = `
	<li><a href="/topic?id=0">js</a></li>
	<li><a href="/topic?id=1">nodejs</a></li>
	<li><a href="/topic?id=2">express</a></li>
	`
	res.send(li + '<br>' + topic[req.query.id]);
})