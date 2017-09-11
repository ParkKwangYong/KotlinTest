package test.kotlintest

/**
 * Created by Android on 2017. 5. 25..
 */
enum class ProtocolState {

    SUCCESS {
        override fun signal() = FAILED
    },

    FAILED {
        override fun signal() = SUCCESS
    };


    abstract fun singal(): ProtocolState
}