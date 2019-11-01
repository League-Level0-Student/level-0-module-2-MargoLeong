void draw() {

/* Use the method below to put moles in the holes. */





     noStroke();
     fill(125, 93, 43);
     ellipse(200, 200, 60, 60); // face
     ellipse(70, 119, 60, 60); // face

     fill(255, 237, 209);
     ellipse(200, 200+10, 33, 28); 
     fill(0, 0, 0);
     ellipse(200-10, 200-15, 10, 10); // eyes
     ellipse(200+10, 200-15, 10, 10);
     ellipse(70-10,119-15,10,10);
     ellipse(70+10,119-15,10,10);
     ellipse(200, 200-5, 10, 10); // nose
     ellipse(70, 119-5, 10, 10); 
     ellipse(200, 200+10, 20, 5); // mouth
     ellipse(70, 119+10, 20, 5); // mouth
}

void setup() {
     size(400, 400);
     background(78, 166, 51); // green grass
     fill(0, 0, 0);
     ellipse(200, 200, 100, 30); // holes
     ellipse(70, 119, 100, 30);
     ellipse(300, 60, 100, 30);
     ellipse(297, 350, 100, 30);
}
