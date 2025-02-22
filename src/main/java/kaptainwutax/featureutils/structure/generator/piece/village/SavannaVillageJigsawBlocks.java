package kaptainwutax.featureutils.structure.generator.piece.village;

import kaptainwutax.mcutils.util.data.Pair;
import kaptainwutax.mcutils.util.data.Quad;
import kaptainwutax.mcutils.util.pos.BPos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SavannaVillageJigsawBlocks {
	public static final HashMap<String, List<Pair<Quad<String, String, String, String>, BPos>>> JIGSAW_BLOCKS = new HashMap<String, List<Pair<Quad<String, String, String, String>, BPos>>>() {{
		this.put("savanna/houses/savanna_animal_pen_3", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(2, 0, 6)),
			new Pair<>(new Quad<>("village/common/animals", "bottom", "bottom", "grass_block"), new BPos(4, 0, 5)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "acacia_fence[east=true,west=true]"), new BPos(4, 1, 8))
		));
		this.put("savanna/houses/savanna_armorer_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 3))
		));
		this.put("savanna/houses/savanna_butchers_shop_1", Arrays.asList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 0, 6)),
			new Pair<>(new Quad<>("village/common/butcher_animals", "bottom", "bottom", "dirt"), new BPos(8, 0, 5))
		));
		this.put("savanna/houses/savanna_butchers_shop_2", Arrays.asList(
			new Pair<>(new Quad<>("village/common/butcher_animals", "bottom", "bottom", "grass_block"), new BPos(10, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "acacia_stairs[facing=east]"), new BPos(0, 1, 4))
		));
		this.put("savanna/houses/savanna_cartographer_1", Arrays.asList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "acacia_stairs[facing=east]"), new BPos(0, 0, 4)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "structure_void"), new BPos(4, 0, 4))
		));
		this.put("savanna/houses/savanna_fisher_cottage_1", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(0, 1, 7)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(4, 1, 3)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(6, 1, 8)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "acacia_stairs[facing=south]"), new BPos(3, 2, 0))
		));
		this.put("savanna/houses/savanna_fletcher_house_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 8))
		));
		this.put("savanna/houses/savanna_large_farm_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "acacia_log"), new BPos(3, 1, 8))
		));
		this.put("savanna/houses/savanna_large_farm_2", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(6, 1, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 2, 0))
		));
		this.put("savanna/houses/savanna_library_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "acacia_stairs[facing=south,half=bottom,shape=straight,waterlogged=false]"), new BPos(5, 1, 0))
		));
		this.put("savanna/houses/savanna_mason_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 5))
		));
		this.put("savanna/houses/savanna_medium_house_1", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(0, 0, 8)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "acacia_planks"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "acacia_planks"), new BPos(3, 0, 11)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 7))
		));
		this.put("savanna/houses/savanna_medium_house_2", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "acacia_planks"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(7, 0, 2)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "acacia_planks"), new BPos(7, 0, 8)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 5))
		));
		this.put("savanna/houses/savanna_shepherd_1", Arrays.asList(
			new Pair<>(new Quad<>("village/common/sheep", "bottom", "bottom", "grass_block"), new BPos(7, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/trees", "bottom", "bottom", "dirt"), new BPos(10, 1, 8)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "air"), new BPos(0, 2, 5))
		));
		this.put("savanna/houses/savanna_small_farm", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(1, 2, 0))
		));
		this.put("savanna/houses/savanna_small_house_1", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_block"), new BPos(2, 0, 6)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 6))
		));
		this.put("savanna/houses/savanna_small_house_2", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_block"), new BPos(2, 0, 6)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 6))
		));
		this.put("savanna/houses/savanna_small_house_3", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_block"), new BPos(5, 0, 6)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 6))
		));
		this.put("savanna/houses/savanna_small_house_4", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "acacia_planks"), new BPos(5, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 1, 6))
		));
		this.put("savanna/houses/savanna_small_house_5", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "acacia_planks"), new BPos(4, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(6, 1, 3))
		));
		this.put("savanna/houses/savanna_small_house_6", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "acacia_planks"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(6, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 3))
		));
		this.put("savanna/houses/savanna_small_house_7", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_block"), new BPos(5, 0, 6)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 6))
		));
		this.put("savanna/houses/savanna_small_house_8", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(0, 0, 0)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "acacia_log"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 3))
		));
		this.put("savanna/houses/savanna_tannery_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(6, 1, 4))
		));
		this.put("savanna/houses/savanna_temple_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 4))
		));
		this.put("savanna/houses/savanna_temple_2", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 4))
		));
		this.put("savanna/houses/savanna_tool_smith_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 4))
		));
		this.put("savanna/houses/savanna_weaponsmith_1", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(7, 1, 4))
		));
		this.put("savanna/houses/savanna_weaponsmith_2", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "smooth_stone_slab[type=bottom]"), new BPos(0, 1, 6))
		));
		this.put("savanna/streets/corner_01", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(3, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(3, 0, 13)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(8, 0, 12)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(10, 0, 3)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(13, 0, 9)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(0, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(7, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 6))
		));
		this.put("savanna/streets/corner_03", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 3)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(3, 1, 1))
		));
		this.put("savanna/streets/crossroad_02", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(1, 0, 2)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(3, 0, 6)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 9)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(6, 1, 5))
		));
		this.put("savanna/streets/crossroad_03", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(2, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(3, 0, 13)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(8, 0, 11)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(0, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(2, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 7)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(11, 1, 7)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(11, 1, 15)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(15, 1, 8))
		));
		this.put("savanna/streets/crossroad_04", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(2, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(2, 1, 4))
		));
		this.put("savanna/streets/crossroad_05", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(2, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(2, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 2))
		));
		this.put("savanna/streets/crossroad_06", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(2, 0, 2)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(2, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(2, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 2))
		));
		this.put("savanna/streets/crossroad_07", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "structure_void"), new BPos(7, 0, 12)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "structure_void"), new BPos(12, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "structure_void"), new BPos(13, 0, 9)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(7, 1, 13)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(8, 1, 13)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(9, 1, 6)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(13, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(14, 1, 7))
		));
		this.put("savanna/streets/split_01", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(4, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(7, 1, 3))
		));
		this.put("savanna/streets/split_02", Arrays.asList(
			new Pair<>(new Quad<>("empty", "empty", "empty", "structure_void"), new BPos(8, 0, 5)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(9, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(10, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(13, 1, 4))
		));
		this.put("savanna/streets/straight_02", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 15)),
			new Pair<>(new Quad<>("empty", "empty", "empty", "structure_void"), new BPos(2, 1, 2)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 3)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 9)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 11))
		));
		this.put("savanna/streets/straight_04", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 4))
		));
		this.put("savanna/streets/straight_05", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 16)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 7)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 9)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 10))
		));
		this.put("savanna/streets/straight_06", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "structure_void"), new BPos(1, 0, 12)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "structure_void"), new BPos(6, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 13)),
			new Pair<>(new Quad<>("empty", "empty", "empty", "structure_void"), new BPos(6, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(7, 1, 0))
		));
		this.put("savanna/streets/straight_08", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(5, 0, 6)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(5, 0, 13)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(6, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 15))
		));
		this.put("savanna/streets/straight_09", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(9, 0, 3)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "grass_block"), new BPos(11, 0, 13)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(9, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(11, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(12, 1, 15)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(13, 1, 11))
		));
		this.put("savanna/streets/straight_10", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 0))
		));
		this.put("savanna/streets/straight_11", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(1, 1, 16)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 7)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 9)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 12))
		));
		this.put("savanna/streets/turn_01", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(6, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 6)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(9, 1, 7)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(9, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 5))
		));
		this.put("savanna/terminators/terminator_05", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "structure_void"), new BPos(1, 0, 2)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "structure_void"), new BPos(1, 0, 12)),
			new Pair<>(new Quad<>("village/savanna/decor", "bottom", "bottom", "structure_void"), new BPos(1, 0, 14)),
			new Pair<>(new Quad<>("empty", "street", "street", "structure_void"), new BPos(0, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 8))
		));
		this.put("savanna/town_centers/savanna_meeting_point_1", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_path"), new BPos(2, 0, 4)),
			new Pair<>(new Quad<>("village/common/iron_golem", "bottom", "bottom", "grass_block"), new BPos(3, 0, 6)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_path"), new BPos(5, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_path"), new BPos(8, 0, 4)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_path"), new BPos(8, 0, 6)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(8, 0, 9)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_path"), new BPos(10, 0, 2)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(7, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(8, 1, 11))
		));
		this.put("savanna/town_centers/savanna_meeting_point_2", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(1, 0, 3)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_path"), new BPos(1, 0, 6)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(1, 0, 8)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_path"), new BPos(4, 0, 9)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_path"), new BPos(7, 0, 8)),
			new Pair<>(new Quad<>("village/common/iron_golem", "bottom", "bottom", "grass_block"), new BPos(9, 0, 7)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(5, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(5, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(10, 1, 5))
		));
		this.put("savanna/town_centers/savanna_meeting_point_3", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(1, 0, 2)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_path"), new BPos(1, 0, 3)),
			new Pair<>(new Quad<>("village/common/iron_golem", "bottom", "bottom", "grass_path"), new BPos(1, 0, 7)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_path"), new BPos(2, 0, 5)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(7, 0, 1)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(8, 0, 9)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(8, 1, 5))
		));
		this.put("savanna/town_centers/savanna_meeting_point_4", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_path"), new BPos(0, 0, 3)),
			new Pair<>(new Quad<>("village/savanna/villagers", "bottom", "bottom", "grass_path"), new BPos(1, 0, 1)),
			new Pair<>(new Quad<>("village/common/iron_golem", "bottom", "bottom", "grass_path"), new BPos(1, 0, 7)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(7, 0, 8)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(8, 0, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(0, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(4, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/streets", "street", "street", "structure_void"), new BPos(8, 1, 4))
		));
		this.put("savanna/villagers/baby", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "structure_void"), new BPos(0, 0, 0))
		));
		this.put("savanna/villagers/nitwi", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "structure_void"), new BPos(0, 0, 0))
		));
		this.put("savanna/villagers/unemployed", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "structure_void"), new BPos(0, 0, 0))
		));
		this.put("savanna/zombie/houses/savanna_animal_pen_2", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(1, 1, 10)),
			new Pair<>(new Quad<>("village/common/animals", "bottom", "bottom", "grass_block"), new BPos(4, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(7, 1, 6)),
			new Pair<>(new Quad<>("village/common/animals", "bottom", "bottom", "grass_block"), new BPos(8, 1, 8)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "acacia_fence_gate"), new BPos(4, 2, 0))
		));
		this.put("savanna/zombie/houses/savanna_animal_pen_3", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(2, 0, 6)),
			new Pair<>(new Quad<>("village/common/animals", "bottom", "bottom", "grass_block"), new BPos(4, 0, 5)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "acacia_fence[east=true,west=true]"), new BPos(4, 1, 8))
		));
		this.put("savanna/zombie/houses/savanna_large_farm_2", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(6, 1, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 2, 0))
		));
		this.put("savanna/zombie/houses/savanna_medium_house_1", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(0, 0, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "acacia_planks"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "acacia_planks"), new BPos(3, 0, 11)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 7))
		));
		this.put("savanna/zombie/houses/savanna_medium_house_2", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "acacia_planks"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(7, 0, 2)),
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "acacia_planks"), new BPos(7, 0, 8)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 5))
		));
		this.put("savanna/zombie/houses/savanna_small_house_1", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "grass_block"), new BPos(2, 0, 6)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 6))
		));
		this.put("savanna/zombie/houses/savanna_small_house_2", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "grass_block"), new BPos(2, 0, 6)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(4, 1, 6))
		));
		this.put("savanna/zombie/houses/savanna_small_house_3", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "grass_block"), new BPos(5, 0, 6)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(3, 1, 6))
		));
		this.put("savanna/zombie/houses/savanna_small_house_4", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "acacia_planks"), new BPos(5, 0, 2)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 1, 6))
		));
		this.put("savanna/zombie/houses/savanna_small_house_5", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "acacia_planks"), new BPos(4, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(6, 1, 3))
		));
		this.put("savanna/zombie/houses/savanna_small_house_6", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "acacia_planks"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(6, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 3))
		));
		this.put("savanna/zombie/houses/savanna_small_house_7", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "grass_block"), new BPos(5, 0, 6)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 6))
		));
		this.put("savanna/zombie/houses/savanna_small_house_8", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(0, 0, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/villagers", "bottom", "bottom", "acacia_log"), new BPos(3, 0, 3)),
			new Pair<>(new Quad<>("empty", "building_entrance", "building_entrance", "structure_void"), new BPos(0, 1, 3))
		));
		this.put("savanna/zombie/streets/corner_01", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(3, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(3, 0, 13)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(8, 0, 12)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(10, 0, 3)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(13, 0, 9)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(5, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(7, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 6))
		));
		this.put("savanna/zombie/streets/corner_03", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 3)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(3, 1, 1))
		));
		this.put("savanna/zombie/streets/crossroad_02", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(1, 0, 2)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(3, 0, 6)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 9)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(6, 1, 5))
		));
		this.put("savanna/zombie/streets/crossroad_03", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(2, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(3, 0, 13)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(8, 0, 11)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(2, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 7)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(11, 1, 7)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(11, 1, 15)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(15, 1, 8))
		));
		this.put("savanna/zombie/streets/crossroad_04", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(2, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(2, 1, 4))
		));
		this.put("savanna/zombie/streets/crossroad_05", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(2, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(2, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 2))
		));
		this.put("savanna/zombie/streets/crossroad_06", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(2, 0, 2)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 2)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(2, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(2, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 2))
		));
		this.put("savanna/zombie/streets/crossroad_07", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "structure_void"), new BPos(7, 0, 12)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "structure_void"), new BPos(12, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "structure_void"), new BPos(13, 0, 9)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(7, 1, 13)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(8, 1, 13)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(9, 1, 6)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(13, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(14, 1, 7))
		));
		this.put("savanna/zombie/streets/split_01", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(4, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(7, 1, 3))
		));
		this.put("savanna/zombie/streets/split_02", Arrays.asList(
			new Pair<>(new Quad<>("empty", "empty", "empty", "structure_void"), new BPos(8, 0, 5)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(9, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(10, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(13, 1, 4))
		));
		this.put("savanna/zombie/streets/straight_02", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 15)),
			new Pair<>(new Quad<>("empty", "empty", "empty", "structure_void"), new BPos(2, 1, 2)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 3)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 9)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 11))
		));
		this.put("savanna/zombie/streets/straight_04", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 4))
		));
		this.put("savanna/zombie/streets/straight_05", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 16)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 7)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 9)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 10))
		));
		this.put("savanna/zombie/streets/straight_06", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "structure_void"), new BPos(1, 0, 12)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "structure_void"), new BPos(6, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 13)),
			new Pair<>(new Quad<>("empty", "empty", "empty", "structure_void"), new BPos(6, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(7, 1, 0))
		));
		this.put("savanna/zombie/streets/straight_08", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(5, 0, 6)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(5, 0, 13)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(6, 0, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 15))
		));
		this.put("savanna/zombie/streets/straight_09", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(9, 0, 3)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "grass_block"), new BPos(11, 0, 13)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(9, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(11, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(12, 1, 15)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(13, 1, 11))
		));
		this.put("savanna/zombie/streets/straight_10", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 0))
		));
		this.put("savanna/zombie/streets/straight_11", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(1, 1, 16)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 7)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 9)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 12))
		));
		this.put("savanna/zombie/streets/turn_01", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(6, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(8, 1, 6)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(9, 1, 7)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(9, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(10, 1, 5))
		));
		this.put("savanna/zombie/terminators/terminator_05", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "structure_void"), new BPos(1, 0, 2)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "structure_void"), new BPos(1, 0, 12)),
			new Pair<>(new Quad<>("village/savanna/zombie/decor", "bottom", "bottom", "structure_void"), new BPos(1, 0, 14)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/houses", "building_entrance", "building_entrance", "structure_void"), new BPos(2, 1, 8))
		));
		this.put("savanna/zombie/town_centers/savanna_meeting_point_1", Arrays.asList(
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(7, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(8, 1, 11))
		));
		this.put("savanna/zombie/town_centers/savanna_meeting_point_2", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(1, 0, 3)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(1, 0, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(5, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(5, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(10, 1, 5))
		));
		this.put("savanna/zombie/town_centers/savanna_meeting_point_3", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(1, 0, 2)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(7, 0, 1)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(8, 0, 9)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 5)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 10)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(8, 1, 5))
		));
		this.put("savanna/zombie/town_centers/savanna_meeting_point_4", Arrays.asList(
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(7, 0, 8)),
			new Pair<>(new Quad<>("village/common/cats", "bottom", "bottom", "grass_block"), new BPos(8, 0, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(0, 1, 4)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 0)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(4, 1, 8)),
			new Pair<>(new Quad<>("village/savanna/zombie/streets", "street", "street", "structure_void"), new BPos(8, 1, 4))
		));
		this.put("savanna/zombie/villagers/nitwi", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "structure_void"), new BPos(0, 0, 0))
		));
		this.put("savanna/zombie/villagers/unemployed", Collections.singletonList(
			new Pair<>(new Quad<>("empty", "bottom", "bottom", "structure_void"), new BPos(0, 0, 0))
		));
	}};
}
