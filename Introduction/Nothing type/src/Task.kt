import java.lang.IllegalArgumentException

/*

常に例外をスローする関数には、戻り値の型として Nothing を使用することができます。
そのような関数を呼び出すと、コンパイラは関数の実行がそれ以降続かないことを前提に処理します。

failWithWrongAge 関数には Nothing 型を戻り値として指定してください。
Nothing 型を指定しない場合、checkAge 関数はコンパイルされません。
これは、コンパイラが年齢が null である可能性を前提としているためです。

*/

fun failWithWrongAge(age: Int?): Nothing {
    throw IllegalArgumentException("Wrong age: $age")
}

fun checkAge(age: Int?) {
    if (age == null || age !in 0..150) failWithWrongAge(age)
    println("Congrats! Next year you'll be ${age + 1}.")
}

fun main() {
    checkAge(10)
}