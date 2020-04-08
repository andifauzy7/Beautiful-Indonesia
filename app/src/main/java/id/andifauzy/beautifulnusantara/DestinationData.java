package id.andifauzy.beautifulnusantara;

import java.util.ArrayList;

public class DestinationData {
    private static String[] listNameDestination = {
            "Candi Borobudur",
            "Candi Prambanan",
            "Taman Komodo",
            "Taman Ujung Kulon",
            "Situs Sangiran",
            "Taman Lorentz",
            "Taman Sembilang",
            "Taman Leuser",
            "Kerinci Seblat",
            "Bukit Barisan",
            "Cultural Subak Bali",
            "Tambang Ombilin"
    };

    private static String[] listKotaDestination = {
            "Magelang",
            "Yogyakarta",
            "Manggarai",
            "Serang",
            "Sragen",
            "Papua",
            "Banyuasin",
            "Gayo Lues",
            "Padang",
            "Jambi",
            "Bali",
            "Padang"
    };

    private static String[] listProvinsiDestination = {
            "Jawa Tengah",
            "DI Yogyakarta",
            "NTT",
            "Banten",
            "Jawa Tengah",
            "Papua",
            "Sumatera Selatan",
            "Aceh",
            "Sumatera Barat",
            "Sumatera Selatan",
            "Bali",
            "Sumatera Barat"
    };

    private static String[] descDestination = {
            "Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta.",
            "Candi Hindu terbesar di Indonesia yang dibangun pada abad ke-9 masehi. Candi ini dipersembahkan untuk Trimurti, tiga dewa utama Hindu yaitu Brahma sebagai dewa pencipta, Wisnu sebagai dewa pemelihara, dan Siwa sebagai dewa pemusnah",
            "Taman Nasional Komodo terletak di daerah administrasi Provinsi Nusa Tenggara Timur, dan dekat dengan kepulauan Sumbawa provinsi Nusa Tenggara Barat. Taman nasional ini terdiri atas tiga pulau besar Pulau Komodo, Pulau Rinca, dan Pulau Padar serta beberapa pulau kecil lainnya",
            "Taman Nasional Ujung Kulon terletak di bagian paling barat Pulau Jawa, Indonesia. Kawasan taman nasional ini pada mulanya meliputi wilayah Krakatau dan beberapa pulau kecil di sekitarnya seperti Pulau Handeuleum dan Pulau Peucang dan Pulau Panaitan.",
            "Museum Purbakala Sangiran dalah museum arkeologi yang terletak di Kalijambe, Kabupaten Sragen, Jawa Tengah, Indonesia. Museum ini berdekatan dengan area situs fosil purbakala Sangiran yang merupakan salah satu Situs Warisan Dunia UNESCO.",
            "Taman Nasional Lorentz adalah sebuah taman nasional yang terletak di provinsi Papua, Indonesia. Dengan luas wilayah sebesar 2,4 juta Ha; Lorentz merupakan taman nasional terbesar di Asia Tenggara. Taman ini masih belum dipetakan, dijelajahi dan banyak terdapat tanaman asli, hewan dan budaya. ",
            "Taman Nasional Sembilang adalah taman nasional yang terletak di Kabupaten Banyuasin, pesisir Provinsi Sumatra Selatan, Indonesia. Taman Nasional ini memiliki luas sebesar 2.051 km²",
            "Taman Nasional Gunung Leuser biasa disingkat TNGL adalah salah satu Kawasan Pelestarian Alam di Indonesia seluas 1.094.692 hektare yang secara administrasi pemerintahan terletak di Provinsi Aceh dan Sumatra Utara",
            "Taman Nasional Kerinci Seblat adalah taman nasional terbesar di Sumatra yang memiliki luas wilayah sebesar 13,750 km².",
            "Pegunungan Bukit Barisan adalah jajaran gunung yang membentang dari ujung utara sampai ujung selatan di pulau Sumatra, yang memiliki panjang lebih kurang 1.650 km. Rangkaian pegunungan ini mempunyai puncak tertinggi Gunung Kerinci yang berlokasi di Jambi, berketinggian 3.805 meter di atas permukaan laut",
            "Lanskap kultur Provinsi Bali merupakan sebuah lanskap yang berada di Provinsi Bali, yang ditetapkan menjadi salah satu Situs Warisan Dunia UNESCO pada Tahun 2012. Lanskap tersebut terdiri dari pedesaan dan sawah bertingkat di Bali, dengan sistem subak, pura, dan candi yang berada di sana.",
            "Tambang Batu Bara Ombilin adalah tambang batu bara di Kota Sawahlunto, tepatnya di lembah sempit di sepanjang Pegunungan Bukit Barisan, Sumatra Barat, Indonesia. Letaknya sekitar 70 kilometer dari timur laut Kota Padang, ibu kota provinsi."
    };

    private static String[] descMoreDestination = {
            "Pasti banyak diantara kamu yang sudah familiar dengan Candi Borobudur? Borobudur ditetapkan menjadi Situs Warisan Dunia oleh UNESCO pada 1991. Candi Buddha terbesar di dunia ini berdiri sangat anggun dan kokoh di atas sebuah bukit yang dikelilingi oleh pegunungan dan perbukitan. Tidak heran bila Borobudur tidak hanya menghadirkan wisata sejarah dan budaya tapi juga pemandangan alam yang mengesankan. \nBorobudur dibuka mulai pukul 06.00 waktu setempat. Di bagian puncak Borobudur kamu bisa menyaksikan pemandangan matahari terbit dari sela-sela perbukitan yang dijamin akan membuatmu terpana. ",
            "Sama seperti Candi Borobudur, Candi Prambanan juga dikukuhkan sebagai Situs Warisan Dunia UNESCO pada 1991. Namun, berbeda dengan Borobudur, Prambanan adalah Candi peninggalan agama Hindu di Indonesia. Bentuknya yang tinggi, besar namun ramping membuat candi yang satu ini terlihat indah; wajar saja jika Prambanan disebut sebagai salah satu candi terindah di Asia Tenggara. \nBicara tentang Prambanan tentu tidak lepas dari legenda Roro Jonggrang yang minta dibuatkan seribu candi dalam semalam kepada Bandung Bondowoso. Nah, di sini kamu bisa melihat langsung arca Roro Jonggrang lho! Selain itu, kamu juga bisa melihat pementasan sendratari Ramayana maupun pentas musik jazz tahunan yang sangat populer dan sayang jika dilewatkan begitu saja.",
            "Taman Nasional Komodo terdiri dari tiga pulau utama yaitu Pulau Komodo, Pulau Rinca dan Pulau Padar dan beberapa pulau kecil di sekitarnya. Ketiga pulau ini khususnya Pulau Komodo dan Rinca merupakan habitat naga komodo yang merupakan kadal pemakan daging terbesar di dunia. Komodo juga termasuk spesies yang rawan akan kepunahan lho. \nDi Taman Nasional Komodo, kamu tidak hanya bisa melihat komodo dari jarak dekat, tapi kamu juga bisa menikmati keindahan pantai serta alam bawah lautnya yang spektakuler.",
            "Taman Nasional Ujung Kulon khususnya di Wilayah Semenanjung Ujung Kulon diperuntukkan secara khusus untuk habitat hewan langka badak bercula satu atau yang lebih dikenal sebagai badak Jawa. Berlokasi di Provinsi Banten, Taman Nasional Ujung Kulon memiliki setidaknya lima jenis lanskap alam yang menarik untuk dijelajahi, antara lain hutan pantai, hutan mangrove, hutan rawa air tawar, hutan hujan tropis dan padang rumput. \nTaman nasional di ujung barat Pulau Jawa ini juga memiliki tiga pulau dengan pantai pasir putih yang sangat cantik lho. Ada Pulau Panaitan, Pulau Handeleum, Pulau Badul dan Pulau Peucang. Jika beruntung, kamu bisa melihat sekelompok rusa berjalan-jalan di area pantai. Menarik sekali bukan? ",
            "Mempelajari fosil manusia purba menjadi hal yang penting untuk dilakukan karena menyangkut sejarah masa lalu bumi dan penghuni di dalamnya. Di Indonesia terdapat sebuah tempat dimana pernah ditemukan fosil manusia purba yang penting bagi dunia ilmu pengetahuan; tempat tersebut adalah Sangiran. \nSitus Sangiran berlokasi di dua wilayah kabupaten yaitu Sragen dan Karanganyar. Sangiran tidak hanya menyimpan fosil manusia purba tapi juga alat  dari batu-batuan peninggalan budaya purba serta lapisan tanah purba yang menunjukkan perubahan lingkungan alam. Kamu dijamin bisa belajar banyak hal tentang arkeologi jika berkunjung ke situs ini deh. ",
            "Situs Warisan Dunia UNESCO yang satu ini lokasinya berada di ujung timur Indonesia. Taman Nasional Lorentz merupakan pintu gerbang menuju Puncak Cartenz yang merupakan salah satu dari tujuh puncak tertinggi di dunia. Puncak Cartenz adalah satu-satunya tempat di Indonesia dimana kita bisa melihat gletser atau salju. Unik sekali bukan? \nSelain lanskap pegunungan bersalju, kamu juga bisa menikmati beraneka macam ekosistem yang bervariasi mulai dari danau hingga perairan laut yang tidak kalah indahnya. Taman nasional seluas 2,4 juta hektar ini menyimpan keragaman flora, fauna serta budaya yang unik. Yuk, berpetualang di Taman Nasional Lorentz!",
            "Taman Nasional Sembilang terdiri dari hutan rawa gambut, hutan rawa air tawar dan hutan tepian sungai di Provinsi Sumatera Selatan. Di sini kamu bisa melihat berbagai spesies burung yang unik. \nPada bulan Oktober kamu bisa menemui kawanan burung yang bermigrasi dari Siberia lho. Pesisir dan kawasan hutannya merupakan habitat bagi harimau Sumatera yang kini sudah semakin sulit ditemui. Waktu terbaik untuk mengunjungi Taman Nasional Sembilang yaitu pada bulan Juni hingga Agustus. ",
            "Taman Nasional Gunung Leuser (TNGL)berlokasi di Provinsi Aceh dan Sumatera Utara. Tempat yang terkenal dan menjadi daya tarik wisata alam adalah Bukit Lawang yang juga merupakan tempat pengamatan Orangutan Sumatera. \n TNGL juga merupakan rumah bagi gajah Sumatera. Wilayah perairan tawarnya dihuni oleh berbagai macam ikan yang panjangnya bisa mencapai satu meter lho!",
            "Taman Nasional yang satu ini merupakan taman nasional terbesar di Sumatera. Di taman nasional inilah kamu bisa mendapati sebagian besar bagian dari bukit barisan berdiri kokoh. Termasuk di antaranya adalah Gunung Kerinci yang merupakan dataran tertinggi di Sumatera. \nKamu juga bisa menikmati wisata alam berupa danau tertinggi di Asia Tenggara, yaitu Danau Gunung Tujuh. Selain itu, banyak sekali mata air, sungai-sungai yang beraliran deras, goa, serta air terjun yang tersebar di area taman nasional. Jangan lupa juga untuk melihat bunga terbesar di dunia, Rafflesia Arnoldi, yang dikenal dengan nama bunga bangkai. Seru sekali, bukan? ",
            "Taman Nasional Bukit Barisan Selatan dibuat secara khusus sebagai tempat konservasi dan perlindungan bagi badak, gajah, dan harimau Sumatera yang jumlahnya terus berkurang. Karena keanekaragaman hayati di dalamnya, taman nasional Bukit Barisan Selatan masuk dalam Global 200 Ecoregions yang merupakan peringkat WWF untuk habitat darat, air tawar dan laut di bumi yang paling mencolok dari sudut pandang biologi. ",
            "Pada tahun 2012, bertambah satu Situs Warisan Dunia UNESCO yang ada di Indonesia. Kali ini lokasinya berada di Bali. Tidak lain dan tidak bukan adalah lanskap pedesaan dan sawah bertingkat di Bali, dengan sistem subak beserta pura dan candi di sekitarnya. Subak adalah organisasi pengelolaan sawah berbasis kearifan lokal masyarakat Bali yang menggambarkan hubungan harmonis antara Tuhan, manusia dan alam sekitar.\nLebih detailnya, Situs Warisan Dunia UNESCO di Bali yang satu ini meliputi kawasan subak Pakerisan dan Catur Angga Batukaru serta dua pura utama yakni Pura Ulun Danu Batur, Pura Taman Ayun dan Danau Batur.",
            "Tambang batubara Ombilin Sawahlunto bisa dikatakan sebagai bukti penting dari perkembangan teknologi, rancang bangun dan arsitektur, perencanaan kota dan seni monumental dalam sejarah perkembangan kebudayaan manusia. Karena alasan tersebut Pertemuan Komite Warisan Dunia Sesi ke-43, di Baku, Azerbaijan, Sabtu (6/7), menetapkan Tambang Batubara Ombilin Sawahlunto sebagai salah satu dari 35 warisan dunia UNESCO 2019.\nDi Tambang Batubara Ombilin Sawahlunto ini juga kamu bisa melihat perkembangan teknologi yang menggabungkan ilmu teknik pertambangan bangsa Eropa dengan kearifan lingkungan lokal, praktik tradisional dan nilai budaya dalam kegiatan penambangan batubara masyarakat Sumatera Barat."
    };

    private static Double[] ratingDestination = {
            8.8,
            9.4,
            9.4,
            8.8,
            9.0,
            9.0,
            8.6,
            8.8,
            8.6,
            6.4,
            9.0,
            8.0
    };

    private static int[] photoDestination = {
            R.drawable.borobudur,
            R.drawable.prambanan,
            R.drawable.tamankomodo,
            R.drawable.ujungkulon,
            R.drawable.sangiran,
            R.drawable.lorentz,
            R.drawable.sembilang,
            R.drawable.leuser,
            R.drawable.kerinci,
            R.drawable.bukitbarisan,
            R.drawable.subakbali,
            R.drawable.ombilin
    };

    static ArrayList<Destination> getData(){
        ArrayList<Destination> destinations = new ArrayList<>();
        for (int i=0; i < listNameDestination.length; i++){
            Destination destination = new Destination(
                    listNameDestination[i],
                    listKotaDestination[i],
                    listProvinsiDestination[i],
                    descDestination[i],
                    descMoreDestination[i],
                    ratingDestination[i],
                    photoDestination[i]
            );
            destinations.add(destination);
        }
        return destinations;
    }
}
