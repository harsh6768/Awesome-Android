package com.technohack.recyclerviewdemo;

import java.util.List;

public class PixabayImageResponse {
    /**
     * totalHits : 500
     * hits : [{"largeImageURL":"https://pixabay.com/get/ea35b70c2afc053ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":907,"imageWidth":6000,"id":3063284,"user_id":1564471,"views":563078,"comments":197,"pageURL":"https://pixabay.com/photos/rose-flower-petal-floral-noble-3063284/","imageHeight":4000,"webformatURL":"https://pixabay.com/get/ea35b70c2afc053ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":99,"tags":"rose, flower, petal","downloads":355738,"user":"annca","favorites":771,"imageSize":3574625,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2015/11/27/06-58-54-609_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/01/05/16/24/rose-3063284_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ea34b00c2bf5093ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":733,"imageWidth":2736,"id":3113318,"user_id":7410713,"views":401903,"comments":114,"pageURL":"https://pixabay.com/photos/sunflower-nature-flora-flower-3113318/","imageHeight":1824,"webformatURL":"https://pixabay.com/get/ea34b00c2bf5093ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":99,"tags":"sunflower, nature, flora","downloads":297039,"user":"bichnguyenvo","favorites":474,"imageSize":1026006,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2017/12/16/10-28-39-199_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/01/28/11/24/sunflower-3113318_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ea37b80d21f7033ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":400,"webformatWidth":640,"likes":549,"imageWidth":3200,"id":3292932,"user_id":2216431,"views":262821,"comments":40,"pageURL":"https://pixabay.com/photos/sunflower-vase-vintage-retro-wall-3292932/","imageHeight":2000,"webformatURL":"https://pixabay.com/get/ea37b80d21f7033ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":93,"tags":"sunflower, vase, vintage","downloads":211823,"user":"Yuri_B","favorites":715,"imageSize":2563708,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2018/01/15/10-52-15-382_250x250.png","previewURL":"https://cdn.pixabay.com/photo/2018/04/05/14/09/sunflower-3292932_150.jpg"},{"largeImageURL":"https://pixabay.com/get/eb37b80a2cf7053ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":597,"imageWidth":5363,"id":2295434,"user_id":334088,"views":78874,"comments":44,"pageURL":"https://pixabay.com/photos/spring-bird-bird-tit-spring-blue-2295434/","imageHeight":3575,"webformatURL":"https://pixabay.com/get/eb37b80a2cf7053ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":99,"tags":"spring bird, bird, tit","downloads":37068,"user":"jill111","favorites":669,"imageSize":2938651,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2018/06/27/01-23-02-27_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2017/05/08/13/15/spring-bird-2295434_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ee34b40a2cf41c22d2524518b745449fe672e7d604b0144497f6c77aa1efbc_1280.jpg","webformatHeight":360,"webformatWidth":640,"likes":276,"imageWidth":3020,"id":715540,"user_id":916237,"views":87326,"comments":31,"pageURL":"https://pixabay.com/photos/yellow-natural-flower-blossom-715540/","imageHeight":1703,"webformatURL":"https://pixabay.com/get/ee34b40a2cf41c22d2524518b745449fe672e7d604b0144497f6c77aa1efbc_640.jpg","type":"photo","previewHeight":84,"tags":"yellow, natural, flower","downloads":43141,"user":"Wow_Pho","favorites":275,"imageSize":974940,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2015/04/07/14-10-15-590_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2015/04/10/00/41/yellow-715540_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ed35b20920fc093ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":56,"imageWidth":6000,"id":4036888,"user_id":1161770,"views":8440,"comments":24,"pageURL":"https://pixabay.com/photos/tulip-blossom-pistil-pollen-4036888/","imageHeight":4000,"webformatURL":"https://pixabay.com/get/ed35b20920fc093ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":99,"tags":"tulip, blossom, pistil","downloads":5975,"user":"Bru-nO","favorites":23,"imageSize":4186509,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2018/09/06/13-50-47-520_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2019/03/05/19/34/tulip-4036888_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ea37b00a29fc093ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":358,"webformatWidth":640,"likes":350,"imageWidth":2027,"id":3215188,"user_id":7097598,"views":142129,"comments":94,"pageURL":"https://pixabay.com/photos/flowers-orange-orange-petals-3215188/","imageHeight":1134,"webformatURL":"https://pixabay.com/get/ea37b00a29fc093ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":83,"tags":"flowers, orange, orange petals","downloads":97793,"user":"Candiix","favorites":292,"imageSize":399066,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2017/12/06/20-08-45-84_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/03/10/20/26/flowers-3215188_150.jpg"},{"largeImageURL":"https://pixabay.com/get/eb34b50a2df7083ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":390,"webformatWidth":640,"likes":336,"imageWidth":4000,"id":2145539,"user_id":2364555,"views":42586,"comments":28,"pageURL":"https://pixabay.com/photos/crocus-flower-wet-spring-2145539/","imageHeight":2443,"webformatURL":"https://pixabay.com/get/eb34b50a2df7083ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":91,"tags":"crocus, flower, wet","downloads":24349,"user":"pixel2013","favorites":318,"imageSize":823922,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/01/30/19-38-32-471_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2017/03/15/09/00/crocus-2145539_150.jpg"},{"largeImageURL":"https://pixabay.com/get/e830b20928fc093ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":419,"webformatWidth":640,"likes":247,"imageWidth":4896,"id":1536088,"user_id":1195798,"views":274496,"comments":54,"pageURL":"https://pixabay.com/photos/sunflower-flower-bloom-yellow-1536088/","imageHeight":3208,"webformatURL":"https://pixabay.com/get/e830b20928fc093ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":98,"tags":"sunflower, flower, bloom","downloads":44109,"user":"Couleur","favorites":215,"imageSize":5103399,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/02/12/21-34-01-586_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2016/07/23/00/12/sun-flower-1536088_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ec33b50e2ce90021d85a5854ef4e4f93e672e1c818b4144393f6c27fa5e4_1280.jpg","webformatHeight":428,"webformatWidth":640,"likes":464,"imageWidth":3872,"id":56414,"user_id":9003,"views":64400,"comments":77,"pageURL":"https://pixabay.com/photos/anemone-flower-blossom-bloom-blue-56414/","imageHeight":2592,"webformatURL":"https://pixabay.com/get/ec33b50e2ce90021d85a5854ef4e4f93e672e1c818b4144393f6c27fa5e4_640.jpg","type":"photo","previewHeight":100,"tags":"anemone, flower, blossom","downloads":25245,"user":"Albenheim","favorites":394,"imageSize":770723,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2012/09/08/21-14-56-990_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2012/09/08/21/51/anemone-56414_150.jpg"},{"largeImageURL":"https://pixabay.com/get/e830b00d20f5023ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":323,"webformatWidth":640,"likes":229,"imageWidth":3861,"id":1512813,"user_id":2364555,"views":70308,"comments":22,"pageURL":"https://pixabay.com/photos/lily-flowers-early-flower-garden-1512813/","imageHeight":1952,"webformatURL":"https://pixabay.com/get/e830b00d20f5023ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":75,"tags":"lily, flowers, early","downloads":34519,"user":"pixel2013","favorites":230,"imageSize":1037708,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/01/30/19-38-32-471_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2016/07/12/18/54/lily-1512813_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ee37b80a29f11c22d2524518b745449fe672e7d604b0144497f6c77aa1efbc_1280.jpg","webformatHeight":416,"webformatWidth":640,"likes":291,"imageWidth":1980,"id":729515,"user_id":909086,"views":38728,"comments":18,"pageURL":"https://pixabay.com/photos/flower-beautiful-bloom-blooming-729515/","imageHeight":1288,"webformatURL":"https://pixabay.com/get/ee37b80a29f11c22d2524518b745449fe672e7d604b0144497f6c77aa1efbc_640.jpg","type":"photo","previewHeight":97,"tags":"flower, beautiful, bloom","downloads":25002,"user":"Bess-Hamiti","favorites":379,"imageSize":370390,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2017/09/19/10-02-47-777_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2015/04/19/08/33/flower-729515_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ea32b30f2bfc023ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":171,"imageWidth":6000,"id":3720383,"user_id":6246704,"views":55615,"comments":41,"pageURL":"https://pixabay.com/photos/flower-g%C3%A9rbel-yellow-flower-flower-3720383/","imageHeight":4000,"webformatURL":"https://pixabay.com/get/ea32b30f2bfc023ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":99,"tags":"flower gérbel, yellow flower, flower","downloads":45178,"user":"fernandozhiminaicela","favorites":140,"imageSize":2117262,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/02/27/14-16-13-192_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/10/03/03/42/flower-gerbel-3720383_150.jpg"},{"largeImageURL":"https://pixabay.com/get/e83cb60d2cf5003ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":372,"webformatWidth":640,"likes":261,"imageWidth":4288,"id":1972411,"user_id":1777190,"views":87829,"comments":30,"pageURL":"https://pixabay.com/photos/drip-blossom-bloom-yellow-1972411/","imageHeight":2499,"webformatURL":"https://pixabay.com/get/e83cb60d2cf5003ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":87,"tags":"drip, blossom, bloom","downloads":74648,"user":"susannp4","favorites":259,"imageSize":1510459,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2015/12/16/17-56-55-832_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2017/01/11/17/27/drip-1972411_150.jpg"},{"largeImageURL":"https://pixabay.com/get/e834b30829f3053ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":370,"imageWidth":4752,"id":1127174,"user_id":1445608,"views":105070,"comments":24,"pageURL":"https://pixabay.com/photos/sunflower-summer-yellow-nature-1127174/","imageHeight":3168,"webformatURL":"https://pixabay.com/get/e834b30829f3053ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":99,"tags":"sunflower, summer, yellow","downloads":62970,"user":"mploscar","favorites":388,"imageSize":3922163,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2016/01/05/14-08-20-943_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2016/01/08/05/24/sunflower-1127174_150.jpg"},{"largeImageURL":"https://pixabay.com/get/e834b2082bf11c22d2524518b745449fe672e7d604b0144497f6c77aa1efbc_1280.jpg","webformatHeight":355,"webformatWidth":640,"likes":176,"imageWidth":2410,"id":113735,"user_id":817,"views":95459,"comments":29,"pageURL":"https://pixabay.com/photos/rose-flower-yellow-yellow-rose-113735/","imageHeight":1337,"webformatURL":"https://pixabay.com/get/e834b2082bf11c22d2524518b745449fe672e7d604b0144497f6c77aa1efbc_640.jpg","type":"photo","previewHeight":83,"tags":"rose, flower, yellow","downloads":15761,"user":"blizniak","favorites":170,"imageSize":299425,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2013/06/28/17-07-05-714_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2013/05/26/12/14/rose-113735_150.jpg"},{"largeImageURL":"https://pixabay.com/get/e836b00629f5053ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":263,"imageWidth":4272,"id":1319114,"user_id":485024,"views":92113,"comments":24,"pageURL":"https://pixabay.com/photos/girl-flowers-yellow-beauty-nature-1319114/","imageHeight":2848,"webformatURL":"https://pixabay.com/get/e836b00629f5053ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":99,"tags":"girl, flowers, yellow","downloads":44007,"user":"AdinaVoicu","favorites":273,"imageSize":3837334,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2019/02/03/18-20-16-279_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2016/04/09/23/10/girl-1319114_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ea35b40f28f3073ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":304,"imageWidth":5472,"id":3050076,"user_id":6663646,"views":138077,"comments":28,"pageURL":"https://pixabay.com/photos/portrait-girl-fog-flowers-beauty-3050076/","imageHeight":3648,"webformatURL":"https://pixabay.com/get/ea35b40f28f3073ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":99,"tags":"portrait, girl, fog","downloads":96920,"user":"ThuyHaBich","favorites":304,"imageSize":2914111,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2017/11/17/08-35-57-188_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2017/12/30/13/25/portrait-3050076_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ec37b20a20e90021d85a5854ef4e4f93e672e1c818b4144393f6c27fa5e4_1280.jpg","webformatHeight":360,"webformatWidth":640,"likes":183,"imageWidth":1920,"id":52358,"user_id":5783,"views":31468,"comments":20,"pageURL":"https://pixabay.com/photos/flower-wild-flower-nature-52358/","imageHeight":1080,"webformatURL":"https://pixabay.com/get/ec37b20a20e90021d85a5854ef4e4f93e672e1c818b4144393f6c27fa5e4_640.jpg","type":"photo","previewHeight":84,"tags":"flower, wild flower, nature","downloads":12302,"user":"PeterDargatz","favorites":161,"imageSize":172383,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2012/06/22/22-42-41-494_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2012/07/12/14/50/flower-52358_150.jpg"},{"largeImageURL":"https://pixabay.com/get/ea33b50f21f7043ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg","webformatHeight":426,"webformatWidth":640,"likes":264,"imageWidth":5574,"id":3640935,"user_id":334088,"views":158777,"comments":57,"pageURL":"https://pixabay.com/photos/sunflowers-field-woman-yellow-3640935/","imageHeight":3717,"webformatURL":"https://pixabay.com/get/ea33b50f21f7043ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg","type":"photo","previewHeight":99,"tags":"sunflowers, field, woman","downloads":137444,"user":"jill111","favorites":242,"imageSize":4970597,"previewWidth":150,"userImageURL":"https://cdn.pixabay.com/user/2018/06/27/01-23-02-27_250x250.jpg","previewURL":"https://cdn.pixabay.com/photo/2018/08/29/22/52/sunflowers-3640935_150.jpg"}]
     * total : 18504
     */

    private int totalHits;
    private int total;
    private List<HitsBean> hits;

    public int getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<HitsBean> getHits() {
        return hits;
    }

    public void setHits(List<HitsBean> hits) {
        this.hits = hits;
    }

    public static class HitsBean {
        /**
         * largeImageURL : https://pixabay.com/get/ea35b70c2afc053ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_1280.jpg
         * webformatHeight : 426
         * webformatWidth : 640
         * likes : 907
         * imageWidth : 6000
         * id : 3063284
         * user_id : 1564471
         * views : 563078
         * comments : 197
         * pageURL : https://pixabay.com/photos/rose-flower-petal-floral-noble-3063284/
         * imageHeight : 4000
         * webformatURL : https://pixabay.com/get/ea35b70c2afc053ed1584d05fb1d4f94ea72e7d01aac104490f2c77fa4ebb7b1_640.jpg
         * type : photo
         * previewHeight : 99
         * tags : rose, flower, petal
         * downloads : 355738
         * user : annca
         * favorites : 771
         * imageSize : 3574625
         * previewWidth : 150
         * userImageURL : https://cdn.pixabay.com/user/2015/11/27/06-58-54-609_250x250.jpg
         * previewURL : https://cdn.pixabay.com/photo/2018/01/05/16/24/rose-3063284_150.jpg
         */

        private String largeImageURL;
        private int webformatHeight;
        private int webformatWidth;
        private int likes;
        private int imageWidth;
        private int id;
        private int user_id;
        private int views;
        private int comments;
        private String pageURL;
        private int imageHeight;
        private String webformatURL;
        private String type;
        private int previewHeight;
        private String tags;
        private int downloads;
        private String user;
        private int favorites;
        private int imageSize;
        private int previewWidth;
        private String userImageURL;
        private String previewURL;

        public String getLargeImageURL() {
            return largeImageURL;
        }

        public void setLargeImageURL(String largeImageURL) {
            this.largeImageURL = largeImageURL;
        }

        public int getWebformatHeight() {
            return webformatHeight;
        }

        public void setWebformatHeight(int webformatHeight) {
            this.webformatHeight = webformatHeight;
        }

        public int getWebformatWidth() {
            return webformatWidth;
        }

        public void setWebformatWidth(int webformatWidth) {
            this.webformatWidth = webformatWidth;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getImageWidth() {
            return imageWidth;
        }

        public void setImageWidth(int imageWidth) {
            this.imageWidth = imageWidth;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public int getViews() {
            return views;
        }

        public void setViews(int views) {
            this.views = views;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }

        public String getPageURL() {
            return pageURL;
        }

        public void setPageURL(String pageURL) {
            this.pageURL = pageURL;
        }

        public int getImageHeight() {
            return imageHeight;
        }

        public void setImageHeight(int imageHeight) {
            this.imageHeight = imageHeight;
        }

        public String getWebformatURL() {
            return webformatURL;
        }

        public void setWebformatURL(String webformatURL) {
            this.webformatURL = webformatURL;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getPreviewHeight() {
            return previewHeight;
        }

        public void setPreviewHeight(int previewHeight) {
            this.previewHeight = previewHeight;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public int getDownloads() {
            return downloads;
        }

        public void setDownloads(int downloads) {
            this.downloads = downloads;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public int getFavorites() {
            return favorites;
        }

        public void setFavorites(int favorites) {
            this.favorites = favorites;
        }

        public int getImageSize() {
            return imageSize;
        }

        public void setImageSize(int imageSize) {
            this.imageSize = imageSize;
        }

        public int getPreviewWidth() {
            return previewWidth;
        }

        public void setPreviewWidth(int previewWidth) {
            this.previewWidth = previewWidth;
        }

        public String getUserImageURL() {
            return userImageURL;
        }

        public void setUserImageURL(String userImageURL) {
            this.userImageURL = userImageURL;
        }

        public String getPreviewURL() {
            return previewURL;
        }

        public void setPreviewURL(String previewURL) {
            this.previewURL = previewURL;
        }
    }
}
