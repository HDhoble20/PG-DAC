import fs from 'fs'
fs.mkdir('./newDir',(err,res)=>{
    fs.writeFile("./newDir/readFileOne.txt","hello every",(err,res)=>{});
})

fs.unlink('./newDir/readFileOne.txt',(err,res)=>{
    fs.rmdir('./newDir',(err,res)=>{})
})
