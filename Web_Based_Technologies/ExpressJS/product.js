require('dotenv').config();
const express=require('express');

const app= express();

const host=process.env.HOST;
const port=process.env.PORT;

//1. DEfault ROUTING
app.get("/",(req,res,next)=>{
    res.send("WELCOME YOU IN PRODUCT PAGE");
});

//2.NAMING ROUTING
app.get("/product",(req,res,next)=>{
    res.send("THIS IS SIMPLE GET REQUEST FOR PRODUCT");
});

app.delete("/product",(req,res,next)=>{
    res.send("THIS IS SIMPLE DELETE REQUEST FOR PRODUCT");
});

app.post("/product",(req,res,next)=>{
    res.send("THIS IS SIMPLE POST REQUEST FOR PRODUCT");
});

app.put("/product",(req,res,next)=>{
    res.send("THIS IS SIMPLE PUT REQUEST FOR PRODUCT");
});

app.listen(port,()=>{
    console.log(`MY SERVER GET STARTED ON ${host}:${port}`)
})