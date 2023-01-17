package com.example.homework20

object Server {
    fun getSites(): List<Any> = listOf(
        GroupItem("Новости"),
        Site(
            "БелТА",
            "https://avatars.mds.yandex.net/i?id=baa16c51c87dc131f6bac81f49bd437e117ea362-7985106-images-thumbs&n=13&exp=1",
            "https://www.belta.by/"
        ),
        Site(
            "Lenta.ru",
            "https://yandex-images.clstorage.net/l99O3LF36/e990e5cB/0-4W6SLSDtG-TjyEoZisOSaJXBWW3v5VnlBUAaYinr2ov8_CCmvgDI6GbvDItKGzmK20bmRfG9rXfP_Yukk2ZWOac-g2FlqQSxsIhRTYLAl2qInBp8879duB8CRmw744SG-P4-oupAxLssqgPZJHxA_6F8m3Lantdb0vrd884nHD3uULlsFNJ65dXRAwGt2LBkoLZzS8yOXIkCXWBCHput1YeLUaf_Xb2vNqB0iRZITveiVpZa6Z3oeMzx-_LmG14TzmyhOgfoYuDF0yEEm-W8aq-iZ0rxjGejH09xdgWAi8KMqUCt8kq8qCOASoA2ZFnOp2abdfSc83rK7MXT6S9DC_pqjQAH6FDHzNwHDpLHo1eMhntl6ptbqyZoSGcCurP9iKdSsMpZu4ofvUmbDEd1549WrmPUm89k2Ozj-tMGcwj7Y4g6PdpF6MD1Ageg3rVjh4RBcdazR54VSERqAo2E0KKme6TWXrawOINRmA9XRP-ATrxn97fsc-3Q9e7BM2s72l63OTXNf__j_DIwmd6GbJSdfErIv3W_KWBRdyyAqO-TrG6W832Gtwaif6wubVnZlmCnT9qJ11fo19_UzxZgMthFnh4D2Fj_7fkVKY_VukCHoVlH7bpcti1FVWoeqYv9m55dp_5JvZEFrGixHWBx5rBonXLwqNli8-Hp29kUXCzHfq0eGd9l78PwAhKtybd0hpZnT_a6c7IDT2xMLruGzaqYeqbNV5mQBqBWuiFredKCbYBvwIz5Ut_j9MfJJ1kH_2CiHSbUZMjryzA4v_ebYK6DQV3PrWm9KUd1ayyCvN2Lnlmr1l6-iwS8Sq0sYVPxuWmiTPS-5Hbv1eTC5TZ7KP53hwcG3V7-7torBaz-vn2LlmNfwpx5nD1RQmooqIjqhKRqmv92iYo7kGSaPnt71aB3s0HGjMtA79XFz9wWRA3OVqIJG_RE89f0JQOk7Ix8maN7QNS_d7gqXU5EP7o",
            "https://lenta.ru/"
        ),
        GroupItem("Соц. сети"),
        Site(
            "ВКонтакте",
            "https://avatars.mds.yandex.net/i?id=8d21a6244604dbdeb1f18640819c9cb420b36e31-8318113-images-thumbs&n=13&exp=1",
            "https://vk.com/"
        ),
        Site(
            "Instagram",
            "https://avatars.mds.yandex.net/i?id=73174ccf9ac2f499916dabb3339e628bcac8899d-8236365-images-thumbs&n=13&exp=1",
            "https://www.instagram.com/"
        ),
        GroupItem("Интернет магазины"),
        Site(
            "Lamoda",
            "https://yandex-images.clstorage.net/l99O3LF36/e990e5cB/0-4W6SLSDtG-TjyEoZisOSaJXBWW3v5VnlBUAaZ3PhiIv_qSj65AfOvzfpCNlIEjXa1UbhQ6Dg-yaeqIqhyjsAa6M-g2FkpwO7sIxXTYLAl2qInBp8879duB8CRmw744SG-P4-oupAxLssqgPZJHxA_6F8m3Lantdb0vrd884nHD3uULlsFNJ65dXRAwGt2LBkoLZzS8yOXIkCXWBCHput1YeLUaf_Xb2vNqB0iRZITveiVpZa6Z3oeMzx-_LmG14TzmyhOgfoYuDF0yEEm-W8aq-iZ0rxjGejH09xdgWAi8KMqUCt8kq8qCOASoA2ZFnOp2abdfSc83rK7MXT6S9DC_pqjQAH6FDHzNwHDpLHo1eMhntl6ptbqyZoSGcCurP9iKdSsMpZu4ofvUmbDEd1549WrmPUm89k2Ozj-tMGcwj7Y4g6PdpF6MD1Ageg3rVjh4RBcdazR54VSERqAo2E0KKme6TWXrawOINRmA9XRP-ATrxn97fsc-3Q9e7BM2s72l63OTXNf__j_DIwmd6GbJSdfErIv3W_KWBRdyyAqO-TrG6W832Gtwaif6wubVnZlmCnT9qJ11fo19_UzxZgMthFnh4D2Fj_7fkVKY_VukCHoVlH7bpcti1FVWoeqYv9m55dp_5JvZEFrGixHWBx5rBonXLwqNli8-Hp29kUXCzHfq0eGd9l78PwAhKtybd0hpZnT_a6c7IDT2xMLruGzaqYeqbNV5mQBqBWuiFredKCbYBvwIz5Ut_j9MfJJ1kH_2CiHSbUZMjryzA4v_ebYK6DQV3PrWm9KUd1ayyCvN2Lnlmr1l6-iwS8Sq0sYVPxuWmiTPS-5Hbv1eTC5TZ7KP53hwcG3V7-7torBaz-vn2LlmNfwpx5nD1RQmooqIjqhKRqmv92iYo7kGSaPnt71aB3s0HGjMtA79XFz9wWRA3OVqIJG_RE89f0JQOk7Ix8maN7QNS_d7gqXU5EP7o",
            "https://www.lamoda.by/"
        ),
        Site(
            "Wildberries",
            "https://avatars.mds.yandex.net/i?id=d0b1f201915849d0f78154ae85f6076f3d58a151-7546005-images-thumbs&n=13&exp=1",
            "https://www.wildberries.by/"
        )
    )
}