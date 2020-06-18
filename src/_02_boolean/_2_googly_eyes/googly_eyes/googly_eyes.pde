PImage eyes;
int x=294;
int y=326;
void setup() {
    eyes = loadImage("eyes.png");
     size(800,600);
    eyes.resize(800,600);
    
}

void draw() {
  background(eyes);
  if(mousePressed){
  println("x;"+mouseX) ;
  println("y;"+mouseY);
  }
  fill(255,255,255);
  ellipse(290,345,250,400);
  ellipse(503,348,250,400);
   if(mouseX>=163&&mouseX<=375){
  
   x=mouseX;
 }
 if(mouseY>=228&&mouseY<=443){
   y=mouseY;
 }
  fill(0);
  ellipse(x,y,100,150);
  ellipse(x+250,y,100,150);

  
}
