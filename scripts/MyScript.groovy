import MyOtherScript
import io.github.hacktheoxidation.MyClass

def myClass = new MyClass(42)

println("Hello from Groovy!")

MyOtherScript.foo()

println("The secret number is ${myClass.foo}")
""