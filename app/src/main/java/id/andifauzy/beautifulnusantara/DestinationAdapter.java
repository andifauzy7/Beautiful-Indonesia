package id.andifauzy.beautifulnusantara;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DestinationAdapter extends RecyclerView.Adapter<DestinationAdapter.ListViewHolder> {
    private ArrayList<Destination> list = new ArrayList<>();
    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Destination data);
    }

    {
        list = DestinationData.getData();
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_destination, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Destination destination = list.get(position);
        Glide.with(holder.itemView.getContext())
                .load(destination.getPhotoDestination())
                .apply(new RequestOptions().override(80, 80))
                .into(holder.photo);
        holder.nameDestination.setText(destination.getNamaDestination());
        holder.lokasiDestination.setText(destination.getNamaKota() + ", " + destination.getNamaProvinsi());
        holder.descDestination.setText(destination.getDescDestination());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(list.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView nameDestination, lokasiDestination, descDestination;
        ImageView photo;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            nameDestination = itemView.findViewById(R.id.nama);
            lokasiDestination = itemView.findViewById(R.id.lokasi);
            descDestination = itemView.findViewById(R.id.desc);
            photo = itemView.findViewById(R.id.avatar);
        }
    }
}
