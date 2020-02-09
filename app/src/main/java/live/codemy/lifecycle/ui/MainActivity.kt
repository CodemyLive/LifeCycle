package live.codemy.lifecycle.ui

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import live.codemy.lifecycle.R
import live.codemy.lifecycle.util.logError
import live.codemy.lifecycle.util.logError2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        "onCreateBeforeContentView".logError()

        setContentView(R.layout.activity_main)

        "onCreateAfterContentView".logError()

        logError2()
    }

    override fun onStart() {
        super.onStart()

        "onStart".logError()
    }

    override fun onRestart() {
        super.onRestart()

        "onRestart".logError()
    }

    override fun onResume() {
        super.onResume()

        "onResume".logError()
    }

    override fun onPause() {
        super.onPause()

        "onPause".logError()
    }

    override fun onDestroy() {
        super.onDestroy()

        "onDestroy".logError()
    }

    override fun onStop() {
        super.onStop()

        "onStop".logError()
    }

    override fun onContentChanged() {
        super.onContentChanged()

        "onContentChanged".logError()
    }

    override fun onBackPressed() {
        super.onBackPressed()

        "onBackPressed".logError()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        "onOptionsItemSelected".logError()

        return super.onOptionsItemSelected(item)
    }

    override fun onOptionsMenuClosed(menu: Menu?) {
        super.onOptionsMenuClosed(menu)

        "onOptionsMenuClosed".logError()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        "onCreateOptionsMenu".logError()

        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        "onPrepareOptionsMenu".logError()

        return super.onPrepareOptionsMenu(menu)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        "onRestoreInstanceState".logError()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        "onSaveInstanceState".logError()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        "onConfigurationChanged".logError()
    }

    override fun startActivityForResult(intent: Intent?, requestCode: Int) {
        super.startActivityForResult(intent, requestCode)

        "startActivityForResult".logError()
    }

    override fun onUserInteraction() {
        super.onUserInteraction()

        "onUserInteraction".logError()
    }
}
