package download.http.listener;

/**
 * Created by lizhiyun on 16/6/4.
 */
public interface OnProgressListener {
    void onProgressUpdate(int curLength, int totalLength);
}
