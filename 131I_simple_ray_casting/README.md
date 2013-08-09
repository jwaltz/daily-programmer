<h1>(Intermediate): Simple Ray-Casting</h1>
<p>Ray Casting is a method of rendering 3D computer graphics, popular in the early/mid 90's. Famous games like Wolfenstein and Doom are great examples of ray-casting based graphics. Real-time computer graphics today are based on hardware-accelerated polygon rasterization, while film-quality computer graphics are based on ray-tracing (a more advanced and finer-detailed ray-casting derivative).
Your goal is to implement a single ray-cast query within a 2D world: you will be given the ray's origin and direction, as well as a top-down view of a tile-based world, and must return the position of the first wall you hit. The world will be made of a grid of tiles that are either occupied (as defined by the 'X' character), or empty (as defined by the space ' ' character). Check out these graphics as a visualization of example 1; it should help clarify the input data. Real ray-casting applications do many of these wall-collision hits, generally one per column of pixels you want to render, but today you only have to solve for a single ray!</p>
Original author: /u/nint22

<h2>Formal Inputs & Outputs</h2>
<h3>Input Description</h3>
<p>On standard console input you will be given two integers, N and M. N is the number of columns, while M is the number of rows. This will be followed by M rows of N-characters, which are either 'x' or ' ' (space), where 'x' is a wall that you can collide with or ' ' which is empty space. After this world-definition data, you will be given three space-delimited floating-point values: X, Y, and R. X and Y are world positions, following this coordinate system description, with R being a radian-value degree representing your ray direction (using the unit-circle definition where if R is zero, it points to the right, with positive R growth rotation counter-clockwise). R is essentially how much you rotate the ray from the default position of X+ in a counter-clockwise manner.</p>
<h3>Output Description</h3>
<p>Simply print the collision coordinate with three-digit precision.</p>

<h2>Sample Inputs & Outputs</h2>
<h3>Sample Input</h3>
<p>Note that this input is rendered and explained in more detail <a href="http://imgur.com/a/pUOKb">here</a>.
<h3>Sample Output</h3>
<p>6.500 1.000</p>
