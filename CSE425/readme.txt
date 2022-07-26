I used code blocks and opengl to solve all the 4 tasks. I've selected glutSolidTeapot as the  object. 
My added functionalities are given below:

Task 1: Color Changes
'c' : toggle through 8 colors
't' : smoothly transitions between different colors


Task 2: Light Position Changes
Key "↓ ↑ → ←" = Changing light Position

Task 3: Spin the Model
'r' : enable or disable auto rotation

Task 4: Mouse based camera control
mouse left: zoom in/rotate anticlockwise
mouse right: zoom out/rotate clockwise
'e' : toggle between mouse rotate and zoom (if 0 then zoom, if 1 then rotate)

for zoom i used glulookat function.

 Extra:
'o' : reset to original position (though it recudes the teapot size)
'q' or 'esc' : exit
'others' : Unhandled key press





A. Were there any references (books, papers, websites, etc.) that you found particularly helpful for completing your assignment? Please provide a list.

Answer: I just followed the class lectures and learned some extra things from Google, Stackoverflow and Youtube. Some of them are given below:
https://www.khronos.org/registry/OpenGL-Refpages/gl2.1/xhtml/ (documentation)
https://www.codeproject.com/Articles/23666/OpenGL-3D-Navigation-glRotatef-glTranslatef-gluLoo (zoom in and zoom out)

B. Are there any known problems with your code? If so, please provide a list and, if possible, describe what you think the cause is and how you might fix them if you had more time or motivation. 
This is very important, as we’re much more likely to assign partial credit if you help us understand what’s going on.

Answer: Though I used glulookat function to zoom in and out, I couldn't do the same for mouse based rotation. I used glRotatef which physically rotates the object rather the moving the camera
view. Also pressing 'o' to reset the object recudes the teapot size.Also I could not implement zoom using mouse scroll. I didn’t spend too much time as it was still working enough well as per requirement 
and I was able to zoom using left/right click. Also while zooming in using the camera, the screen went blank for a while as it changes from the front view to inside the teapot to the bottom of the teapot.
So you have to press the zoom button a little while to see the complete effect. It's not a problem actually. I will happen because of the camera perspective. 


C. Did you do any extra work? If so, let us know how to use the additional features. If there was a substantial amount of work involved, describe what and how you did it.

Answer: I've added extra exit key which is 'q' or 'esc'. Also added reset functionality via key 'o' and for other keys printed "Unhandled key press"
Also adding zoom in and zoom out using camera view was rather challenging then I anticipated. But I managed to complete it using online resource given in the resource list.


D. Got any comments about this assignment that you’d like to share? Was it too long? Too hard? Were the requirements unclear? Did you have fun, or did you hate it? Did you learn something, 
or was it a total waste of your time?

Answer: It wasn't too long or too hard. Every requirements where clear. I did have a lot of fun after completing the assignment. I learn a lot of things. 
Implementing what I learned in theory is rather exciting.