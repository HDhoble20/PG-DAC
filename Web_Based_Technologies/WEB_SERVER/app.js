require('dotenv').config();
const path=require('path');
const hbs=require('hbs');
const express = require('express');

const app= express();
const host=process.env.HOST;
const port=process.env.PORT
//static  file path
const staticFilePath=path.join(__dirname,"/public");

//path for access hbs views file 
const viewsPath=path.join(__dirname,"/templates/views");

const partialsPath=path.join(__dirname,"/templates/partials");

//use of express.static middleware
app.use(express.static(staticFilePath));

//here we define which tempalsate engine we are using
app.set('view engine','hbs');  

//set path
app.set("views",viewsPath);

hbs.registerPartials(partialsPath);


app.get("/",(req,res,next)=>{
    // res.send("this iss home page");
    res.render("index",{
        title:"HOME",
        company:"Bently"
    });
    
});
app.get("/home",(req,res,next)=>{
    // res.send("this iss home page");
    res.render("index",{
        title:"HOME",
        company:"Bently"
    });
    
});
app.get("/about",(req,res,next)=>{
    // res.send("this iss about page");
    res.render("about",{
        title:"ABOUT",
            company:"Bently"
    })

});
app.get("/service",(req,res,next)=>{
    // res.send("this iss service page");
    res.render("service",{
        title:"SERVICE",
            company:"Bently"
    })
});
app.get("/contact",(req,res,next)=>{
    // res.send("this iss contact page");
    res.render("contact",{
        title:"CONTACT",
            company:"Bently"
    })
});
app.get("*d",(req,res,next)=>{
    // res.send("404 page is not found");
    res.render("404",{})
});


app.listen(port,()=>{
    console.log(`My Web Server get started on ${host}:${port}`)
})