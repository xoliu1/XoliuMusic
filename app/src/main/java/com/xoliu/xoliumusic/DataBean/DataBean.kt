package com.xoliu.xoliumusic.DataBean

class DataBean {
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
        val testData3: List<DataBean>
            get() {
                val list: MutableList<DataBean> = ArrayList()
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/31/PqjC6iXanAhSkgw.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/31/qEl6x8VyJGmKRBY.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/31/LjgsoWfyA4rnOmd.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/31/NEG4LFRwAthMJfv.png",
                        null,
                        1
                    )
                )
                //
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/26/osI8hvPt5kBgNFA.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                                "https://s2.loli.net/2023/10/26/SktKQyHBd5x6AIz.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/26/huosclQrdRtjFJi.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                                "https://s2.loli.net/2023/10/26/m3B4nqCu567zhRV.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/26/R7Y1mbqPhoAQl6H.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/26/RaOlsLhXZwiVfT8.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/26/UcDOIL2gbwsxNVz.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/26/jv4IGigU5wWYyS1.png",
                        null,
                        1
                    )
                )
                list.add(
                    DataBean(
                        "https://s2.loli.net/2023/10/26/tMxesdVUBfKOYEo.png",
                        null,
                        1
                    )
                )
                return list
            }
    }
}