class Rectangle():
    
    def __init__(self, length=1, width=1):
        self.length = length
        self.width = width
    
    def calculateArea(self):
        return int(self.length * self.width)

def main():
    
     r1 = Rectangle()
     print("r1 length is ", r1.length, " and width is ", r1.width, "Its area is ", r1.calculateArea())

     r2 = Rectangle(5, 6)
     print("r2 length is {} and width is {}. Its area is {}").format(r2.length, r2.width, r2.calculateArea())
    
main()
