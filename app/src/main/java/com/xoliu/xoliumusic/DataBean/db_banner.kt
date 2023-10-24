package com.xoliu.xoliumusic.DataBean

import com.xoliu.xoliumusic.R

class db_banner {
    public var imageRes: Int = R.drawable.dj
    var imageUrl: String? = null
    var title: String?
    var viewType: Int

    constructor(imageRes: Int?, title: String?, viewType: Int) {
        if (imageRes != null) {
            this.imageRes = imageRes
        }
        this.title = title
        this.viewType = viewType
    }

    constructor(imageUrl: String?, title: String?, viewType: Int,imageRes: Int?) {
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
                        R.drawable.dj,
                        null,
                        1
                    )
                )
                list.add(
                    db_banner(
                        R.drawable.dj,
                        null,
                        1
                    )
                )
                list.add(
                    db_banner(
                        R.drawable.dj,
                        null,
                        1
                    )
                )
                list.add(
                    db_banner(
                        R.drawable.dj,
                        null,
                        1
                    )
                )
                list.add(
                    db_banner(
                        R.drawable.dj,
                        null,
                        1
                    )
                )
                return list
            }
    }

}