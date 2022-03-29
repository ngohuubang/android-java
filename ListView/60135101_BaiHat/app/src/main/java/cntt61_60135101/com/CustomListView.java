package cntt61_60135101.com;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class CustomListView extends BaseAdapter {

    private List<BaiHat> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListView(Context aContext,  List<BaiHat> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.my_item_layout, null);
            holder = new ViewHolder();
            holder.hinh = (ImageView) convertView.findViewById(R.id.ivHinh);
            holder.tenBaiHat = (TextView) convertView.findViewById(R.id.tvTenBai);
            holder.caSi = (TextView) convertView.findViewById(R.id.tvCaSi);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        BaiHat baihat = this.listData.get(position);

        holder.tenBaiHat.setText("Tên bài hát: " + baihat.getTenBaiHat());
        holder.caSi.setText("Tên ca sĩ: " + baihat.getCaSi());

        int imageId = this.getMipmapResIdByName(baihat.getHinh());

        holder.hinh.setImageResource(imageId);

        return convertView;
    }


    // Find Image ID corresponding to the name of the image (in the directory mipmap).
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView hinh;
        TextView tenBaiHat;
        TextView caSi;
    }
}
