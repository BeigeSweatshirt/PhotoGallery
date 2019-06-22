package android.beige.photogallery;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GalleryPage {
    private Photos photos;
    String stat;


    List<GalleryItem> getGalleryItemList() {
        return photos.getPhotoList();
    }
}

class Photos {
    @SerializedName("photo")
    List<GalleryItem> mPhotoList;

    public List<GalleryItem> getPhotoList() {
        return mPhotoList;
    }
}
