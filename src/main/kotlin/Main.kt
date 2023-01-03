import java.util.HashMap

fun isIsomorphic(s: String?, t: String?): Boolean {
    if (s == null || t == null)
        return false

    if (s.length != t.length)
        return false

    val map = HashMap<Char, Char>()

    for (i in 0 until s.length) {
        val c1 = s[i]
        val c2 = t[i]

        if (map.containsKey(c1)) {
            if (map[c1] != c2)
            // if not consistant with previous ones
                return false
        } else {
            if (map.containsValue(c2))
            //if c2 is already being mapped. Time complexity O(n) here
                return false
            map[c1] = c2
        }
    }
    return true
}

fun main(args: Array<String>) {
    if(isIsomorphic("Madam", "liril")){
        println("string is Isomorphic")
    }else{
        println("string is NOT Isomorphic")
    }
}