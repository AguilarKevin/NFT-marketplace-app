package aguilarkevin.dev.nftmarketplace.models

class NFT {

    private lateinit var title: String
    private lateinit var assetUrl: String
    private lateinit var owner: User
    private lateinit var bids: List<Bid>
}