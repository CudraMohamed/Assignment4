fun main(){
var x=intArray(arrayOf(15,5,25))
    println(x)
   var l= allTypes(arrayOf('m',9,9.1,"Members",3.4F,24.22F))
    println(l)
    var k=charArray(arrayOf('a','t','e','b','i','k','o','u'))
    println(k)
}
fun intArray(ints:Array<Int>):Int{
var product=1
    ints.forEach{j->
        product*=j

    }
    return product
}
fun allTypes(all:Array<Any>):Float{
var sum=0.0F
    all.forEach { q ->
        if (q is Float|| q is Double ) {
            sum += q.toString().toFloat()

        }
    }
    return  sum
}
fun charArray(chars:Array<Char>):Int{
    var numbers= 0
    chars.forEach { vowel ->
        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
numbers++
        }
    }
    return numbers
}