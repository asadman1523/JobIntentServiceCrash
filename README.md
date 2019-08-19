# JobIntentServiceCrash
This repository shows how can a call to an JobIntentService can crash if you change extras

## Issue
When using `JobIntentService` there are cases when updating the way the enqueueWork is called references previous versions of the it and it causes applications to crash due to different extras being added to the calling intent.
