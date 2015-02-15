package com.github.mbarrben.moviedb.movielist;

import android.os.Bundle;
import com.github.mbarrben.moviedb.BaseActivity;
import com.github.mbarrben.moviedb.R;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends BaseActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  protected List<Object> getModules() {
    LinkedList<Object> modules = new LinkedList<>();
    modules.add(new MoviesListModule());
    return modules;
  }
}
