#Arnold Fabian Morales Gonzales
#15230927
import math
class FiguraGeometrica:
    def area(self, *args):
        if len(args) == 1:  
            radioCir = args[0]
            return math.pi * radioCir ** 2
        elif len(args) == 2:
            baseRec, alturaRec = args  
            return baseRec * alturaRec
        elif len(args) == 3:
            baseMayTra, baseMenTra, alturaTra = args  
            return ((baseMayTra + baseMenTra) * alturaTra) / 2
        elif len(args) == 2:  
            ladoPent, apotemaPent = args
            return (5 * ladoPent * apotemaPent) / 2      
        else:
            return false
figura = FiguraGeometrica()
print("Círculo:", figura.area(1))
print("Rectángulo:", figura.area(2, 4))
print("Triángulo Rectángulo:", figura.area(3, 5))
print("Trapecio:", figura.area(3, 4, 6))
print("Pentágono:", figura.area(5, 7))
