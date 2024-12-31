/*

Named arguments

joinOptions() 関数が、2つの引数のみを指定して、リストを JSON 形式（例えば、[a, b, c]）で返すようにします。
デフォルト引数と名前付き引数は、オーバーロードの数を最小限に抑え、関数呼び出しの可読性を向上させるのに役立ちます。
ライブラリ関数 joinToString は、パラメータにデフォルト値が設定されています:

fun joinToString(
    separator: String = ", ",
    prefix: String = "",   // 連結したものの先頭に加えたいものを指定する
    postfix: String = "",   // 最後に加えたいものを指定する
    /* ... */
): String

この関数は、文字列のコレクションに対して呼び出すことができます。

*/

fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]")
