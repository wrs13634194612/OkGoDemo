package com.example.okgodemotwo;



        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.ArrayList;
        import java.util.List;

/**
 * online devices
 * Created by Administrator on 2016/10/25.
 */
public class RoomAdapter extends BaseRecyclerViewAdapter<RoomAdapter.ViewHolder> {
    Context mContext;
    List<RoomNumBean.DataBean> mDevices;

    public RoomAdapter(Context context, List<RoomNumBean.DataBean> devices) {
        mContext = context;
        mDevices = devices;
    }

    public void resetDevices(List<RoomNumBean.DataBean> devices) {
        this.mDevices = devices;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_online_device, null, false);
        ViewHolder holder = new ViewHolder(itemView);
        holder.tv_item_share = itemView.findViewById(R.id.tv_item_share);
        holder.tv_item_name    = itemView.findViewById(R.id.tv_item_name);
        holder.tv_item_state    = itemView.findViewById(R.id.tv_item_state);




        holder.img_icon = itemView.findViewById(R.id.img_icon);




        return holder;
    }

    @Override
    public int getItemCount() {
        return mDevices == null ? 0 : mDevices.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
        holder.tv_item_name.setText(mDevices.get(position).getRoomName());

        holder.tv_item_share.setText(""+mDevices.get(position).getList().size());
//        holder.tv_item_state.setText(mDevices.get(position).getEquipmentState());


        holder.tv_item_name.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //  listener.itemOnClick(103,position);
                onViewClickListener.onViewClick(view, position);
            }
        });
    }

    class ViewHolder extends RecyclerView.ViewHolder {


        public ImageView img_icon;
        public TextView tv_item_share,tv_item_name,tv_item_state;

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
