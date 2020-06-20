fun main(args: Array<String>) {
		val t = readLine()!!.toInt()
			repeat(t){
				val (n, k) = readLine()!!.split(" ").map { it.toInt() }
				val my = n/(1+k+k*k+k*k*k)
				println("${my} ${my*k} ${my*k*k} ${my*k*k*k}")
			}
}