class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z

    def incrementa_xz(self):
        self.x += 1
        self.z += 1

    def incrementa_z(self):
        self.z += 1
class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z

    def incrementa_yz(self):
        self.y += 1
        self.z += 1

    def incrementa_z(self):
        self.z += 1
class D(A):
    def __init__(self, x, y, z):
        super().__init__(x, z)  
        self.b = B(y, z)        

    def incrementa_xyz(self):
        self.incrementa_xz()    
        self.b.incrementa_yz()  

    def mostrar_valores(self):
        return f"x = {self.x}, y = {self.b.y}, z_A = {self.z}, z_B = {self.b.z}"
def main():
    x = int(input("Ingresa el valor para x: "))
    y = int(input("Ingresa el valor para y: "))
    z = int(input("Ingresa el valor para z: "))

    objeto = D(x, y, z)

    print("\nValores iniciales:")
    print(objeto.mostrar_valores())

    objeto.incrementa_xyz()

    print("\nDespués de llamar a incrementa_xyz():")
    print(objeto.mostrar_valores())


if __name__ == "__main__":
    main()
