package kaitka.vishal.meeta.bigart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.net.Uri;
import kaitka.vishal.meeta.bigart.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        Uri imageUri = getIntent().getData();
        binding.image.setImageURI(imageUri); // or you can use getIntent().getData() instead of imageUri
    }
}
