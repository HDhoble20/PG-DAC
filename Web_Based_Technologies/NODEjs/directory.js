import fs from 'fs';
//remove file asynchronously
fs.unlink('./readOne.txt',(err,res)=>{})

//how to create directory asynchronously
fs.mkdir("./newDir",(err,res)=>{
    fs.writeFile("./newDir/readFileFour.txt","hello every",(err,res)=>{});
});

fs.unlink("./newDir/readFileFour.txt",(err,res)=>{
    fs.rmdir("./newDir",(err,res)=>{});
});
