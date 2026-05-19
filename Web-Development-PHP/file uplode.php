<?php
$uploads_dir = 'uploads';
if(isset($_REQUEST['submit']))
{
    if(!empty($_REQUEST['submit']))
    {
        $name = $_FILES['f']['name'];
        $tmp = $_FILES['f']['tmp_name'];
        if(move_uploaded_file($tmp, "$uploads_dir/$name"))
            echo "Uploaded";
        else
            echo "Error";
    }
}
else
{
    echo "Please Choose a file";
}

?>