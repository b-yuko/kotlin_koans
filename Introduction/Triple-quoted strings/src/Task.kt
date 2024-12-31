/*

Triple-quoted strings

Kotlinのさまざまな文字列リテラルおよび文字列テンプレートについて学びます。
便利なライブラリ関数 trimIndent と trimMargin を使用すると、複数行のトリプルクォート文字列を周囲のコードに従ってフォーマットできます。
trimIndent の呼び出しを、# をプレフィックス値とする trimMargin の呼び出しに置き換えて、結果の文字列にプレフィックス文字が含まれないようにします。

*/

const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

fun main() {
    println(tripleQuotedString)
}