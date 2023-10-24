package com.xoliu.xoliumusic.DataBean

class db_banner {
    var imageRes: Int? = null
    var imageUrl: String? = null
    var title: String?
    var viewType: Int

    constructor(imageRes: Int?, title: String?, viewType: Int) {
        this.imageRes = imageRes
        this.title = title
        this.viewType = viewType
    }

    constructor(imageUrl: String?, title: String?, viewType: Int) {
        this.imageUrl = imageUrl
        this.title = title
        this.viewType = viewType
    }

    companion object {

        //测试数据，如果图片链接失效请更换
        val testData3: List<db_banner>
            get() {
                val list: MutableList<db_banner> = ArrayList()
                list.add(
                    db_banner(
                        "https://s2.loli.net/2023/10/22/dwUbAEQHeVpRN3y.png",
                        null,
                        1
                    )
                )
                list.add(
                    db_banner(
                        "https://s2.loli.net/2023/10/22/dwUbAEQHeVpRN3y.png",
                        null,
                        1
                    )
                )
                list.add(
                    db_banner(
                        "https://s2.loli.net/2023/10/22/dwUbAEQHeVpRN3y.png",
                        null,
                        1
                    )
                )
                list.add(
                    db_banner(
                        "https://s2.loli.net/2023/10/22/dwUbAEQHeVpRN3y.png",
                        null,
                        1
                    )
                )
                list.add(
                    db_banner(
                        "https://s2.loli.net/2023/10/22/dwUbAEQHeVpRN3y.png",
                        null,
                        1
                    )
                )
                return list
            }
    }

}