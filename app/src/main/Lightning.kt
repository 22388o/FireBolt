import org.bitcoindevkit.bdkjni.LibBitcoin
import org.bitcoindevkit.bdkjni.Types.*
import org.lightningdevkit.LightningApi
import org.lightningdevkit.LightningApi.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    private lateinit var bitcoin: LibBitcoin
    private lateinit var lightning: LightningApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize BDK and LDK
        bitcoin = LibBitcoin()
        lightning = LightningApi()

        // Connect to a Bitcoin node
        val config = Config(
            ChainParams(
                "bitcoin",
                "mainnet",
                0,
                0,
                0
            ),
            Network(
                "127.0.0.1",
                8332,
                "rpcuser",
                "rpcpassword",
                true
            )
        )

