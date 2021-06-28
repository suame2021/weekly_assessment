fun main() {
    evenlySpaced(4,6,2)

}

fun evenlySpaced(a: Int, b: Int, c: Int) {
    if (a > b && a > c && b>c){
        if(b-c==a-b)
            println(true)
        else
            println(false)
    }
    else if(a > b && a > c && c>b){
        if(c-b==a-c)
            println(true)
        else
            println(false)
    }
    else if (b > a && b > c && a>c){
        if(a-c==b-a)
            println(true)
        else
            println(false)
    }
    else if(b > a && b > c && c>a){
        if(c-a==b-c)
            println(true)
        else
            println(false)
    }
    else if (c > a && c > b && a>b){
        if(a-b==c-a)
            println(true)
        else
            println(false)
    }
    else if(c > a && c > b && b>a) {
        if (b - a == c - b)
            println(true)
        else
            println(false)
    }
    else
        println("Invalid Input, Please your input should be of different sizes")
}


