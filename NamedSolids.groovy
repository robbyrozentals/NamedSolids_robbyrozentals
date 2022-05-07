double size =20
double radius =40
return [
new Dodecahedron(radius).toCSG().movex(size*0),
new Icosahedron(size).toCSG().movex(size*2),
new Octahedron(size).toCSG().movex(size*4),
new Tetrahedron(size).toCSG().movex(size*6),

]