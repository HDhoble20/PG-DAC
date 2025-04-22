import http from 'http'
let myserver=http.createServer((req,res)=>{
    if(req.url=="/")
    {
        res.write("");
        res.end();
    }
    else if(req.url=="/home")
    {
        res.write("Home page");
        res.end();
    }
    else if(req.url=="/about")
    {
        res.write("About page ");
        res.end();
    }
    else if(req.url=="/contact")
    {
        res.write("Contact Page")
        res.end();
    }
    else if(req.url=="/gallery")
    {
        res.write("Gallery Page");
        res.end();
    }
    else if(req.url=="/help")
    {
        res.write("Help page");
        res.end();
    }
});
myserver.listen(4444,()=>{
    console.log("server started");
})