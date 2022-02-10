package aguilarkevin.dev.nftmarketplace.models

data class NFT(
    val id: String?,
    val title: String,
    val assetUrl: String,
    val owner: User,
    val bids: List<Bid>
)