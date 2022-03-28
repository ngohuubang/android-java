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

public class MyArrayAdapter extends BaseAdapter {

    private List<DiaDiem> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public MyArrayAdapter(Context aContext, List<DiaDiem> listData){
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
            holder.diaDiem = (TextView) convertView.findViewById(R.id.tvDiaDiem);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        DiaDiem diadiem = this.listData.get(position);
        holder.diaDiem.setText(diadiem.getName());

        int imageId = this.getMipmapResIdByName(diadiem.getHinh());

        holder.hinh.setImageResource(imageId);
        return convertView;
    }

    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("MyArrayAdapter", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView hinh;
        TextView diaDiem;
    }
}
