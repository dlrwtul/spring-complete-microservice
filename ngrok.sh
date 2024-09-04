docker pull ngrok/ngrok

# open ngrok account and replace [TOKEN] by your given token 

docker run --net=host -it -e NGROK_AUTHTOKEN=[TOKEN] ngrok/ngrok:latest http 8083