#Inheritance

class Bird():

    def __init__(self):
        print("Bird is ready")
    
    def whoisThis(self):
        print("Bird")
    
    def swin(self):
        print("Swim faster")

class Penguin(Bird):

    def __init__(self):
        super().__init__()
        print("Penguin is ready")
    
    def whoisThis(self):
        print("Penguin")
    
    def run(self):
        print("Run faster")

peggy = Penguin()
peggy.whoisThis()
peggy.swin()
peggy.run()