// WITH_RUNTIME
// FILE: Parts.java

public class Parts {
    public static final String FIRST = "O";
    public static final String SECOND = "K";
}

// FILE: constVal.kt

class My {
    fun foo(): String {
        if (RESULT.startsWith("OK")) {
            return "OK"
        }
        return "FAIL"
    }

    companion object {
        private const val RESULT = Parts.FIRST + Parts.SECOND
    }
}

fun box() = My().foo()