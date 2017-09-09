Minim minim;
  AudioSample sound;

//1.Make a canvas for your game.
  import ddf.minim.*;
 // Minim minim;
 // AudioSample sound;
  PImage backgroundImage;  
void setup(){
  size(800,1000);
  background(255,255,255);
  minim = new Minim (this); 
  backgroundImage = loadImage("background.jpg");
  sound = minim.loadSample("sad.wav", 128);
  image(backgroundImage, 0, 0, 800, 1000);
} 
 
void draw(){
   //background(255,255,230);
   //image(backgroundImage, 0, 0, 800, 1000);
   ellipse(x=x+speedX,y=y+speedY,100,100); 
   fill(255,255,255); 
   //stroke(60,10,200);
   stroke(55,255,55);
     if(x==width){
       speedX=-speedX; 
     }
     if(x==0){
       speedX=20;
     }  
     if(y==height){
       speedY=-speedY; 
     }
     if(y==0){
       speedY=10;
     }  
     if(x==900){
       
     sound.trigger();
     }
}
int x = 0;
int y = 0;
int speedX = 20;
int speedY = 10;

/*//2. Draw a ball on the screen.

//3. Make the ball move across the screen (left to right).
  //make a variable for the ball's X position and change it in the draw method.

//4. Change the speed of the ball.
  //make a variable for the speed of the ball in the X direction (from left to right).
  //changing this variable should change the speed of your ball

//5. Bounce the ball off the walls.
  width
  println(output)
  
//6. Do the same in the Y (up and down) direction.
  height

//7. Make a sound when the ball falls on the ground.
  //drop the sound file onto your sketch

  import ddf.minim.*;       //at the very top of your sketch
  Minim minim;        //at the top of your sketch
  AudioSample sound;      //at the top of your sketch
  minim = new Minim (this);    //in the setup method
  sound = minim.loadSample("BD.mp3", 128);//in the setup method
  sound.trigger();        //in draw method (when the ball hits the bottom)

//8. Add a background image for your game.
PImage backgroundImage;         //at the top of your sketch
backgroundImage = loadImage("image.jpg");  //in the setup method
image(backgroundImage, 0, 0);      //in draw method image(backgroundImage, 0, 0, width, height);    //if you want to resize

//9. Draw a paddle at the bottom of the screen
  rect(x, y, width, height);

//10. Make the paddle move over and back with the mouse.
  mouseX

//11. Make the ball change Y direction when it hits the paddle. Figure it out by yourself, or use this method:
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else s
}*/