import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieAdapterViewHoldr>{
    @NonNull
    @Override
    public MovieAdapter.MovieAdapterViewHoldr onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieAdapterViewHoldr holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MovieAdapterViewHoldr extends RecyclerView.ViewHolder implements View.OnClickListener {
        public MovieAdapterViewHoldr(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
