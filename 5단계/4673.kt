//셀프넘버 구하는 알고리즘
fun main() {
    var d = IntArray(10036)

    for(i in 1..10001){
        d[dn(i)] =1
        if(d[i]!=1) println(i)
    }
}

fun dn(i: Int): Int {
    var temp = i
    var si = i
    if(si>=10000){
        temp += si/10000
        si %= 10000
    }
    if(i>=1000){
        temp += si/1000
        si %= 1000
    }
    if(i>=100){
        temp += si/100
        si %= 100
    }
    if(i>=10){
        temp += si/10
        si %= 10
    }
    temp +=si
    return temp

}
