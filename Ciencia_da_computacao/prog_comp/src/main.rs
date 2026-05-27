use std::collections::BTreeMap;
use std::io::{BufRead, stdin};
fn main() {
    let mut str = String::new();
    stdin().lock().read_line(&mut str).unwrap();
    let qnt: i32 = str.trim().parse().unwrap();
    let mut map: BTreeMap<String, i32> = BTreeMap::new();
    for _ in 0..qnt {
        str.clear();
        stdin().lock().read_line(&mut str).unwrap();
        match map.get_mut(&str.clone()) {
            Some(a) => *a += 1,
            None => {
                map.insert(str.clone(), 0);
            }
        }
    }
    println!("{}", map.len());
}
