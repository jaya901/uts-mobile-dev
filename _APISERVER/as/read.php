<?php
require_once 'koneksi.php';
$query = "SELECT * FROM laptop ORDER BY id";
$result = mysqli_query($kon,$query);
$array = array();
while ($row = mysqli_fetch_assoc($result)){
    $array[] = $row;
}
echo ($result) ? json_encode(array("kode" => 1, "result"=>$array)) : json_encode(array("kode" => 0, "pesan"=>"data tidak ditemukan"));
?>